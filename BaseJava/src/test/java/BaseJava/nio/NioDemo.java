package BaseJava.nio;

import com.sun.org.apache.bcel.internal.generic.Select;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by liuyong on 2016/3/7.
 */
public class NioDemo {
    public void selector() throws IOException {
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        Selector selector = Selector.open();
        ServerSocketChannel ssc = ServerSocketChannel.open();
        ssc.configureBlocking(false);//设置为非阻塞方式
        ssc.socket().bind(new InetSocketAddress(8080));
        ssc.register(selector, SelectionKey.OP_ACCEPT);//注册监听的事件
        while(true){
            Set selectKeys = selector.selectedKeys();//取得所有的key集合
            Iterator it = selectKeys.iterator();
            while (it.hasNext()){
                SelectionKey key = (SelectionKey) it.next();
                if((key.readyOps() &SelectionKey.OP_ACCEPT) == SelectionKey.OP_ACCEPT){
                    ServerSocketChannel ssChannel = (ServerSocketChannel) key.channel();
                    SocketChannel sc = ssChannel.accept();//接受服务器的请求
                    sc.configureBlocking(false);
                    sc.register(selector, SelectionKey.OP_READ);
                    it.remove();
                }else if((key.readyOps() & SelectionKey.OP_READ) == SelectionKey.OP_READ){
                    SocketChannel sc = (SocketChannel) key.channel();
                    while (true){
                        buffer.clear();
                        int n = sc.read(buffer);
                        if(n < 0){
                            break;
                        }
                        buffer.flip();
                    }
                    it.remove();
                }
            }

        }
    }
}
