package BaseJava.demos;

/**
 * Created by liuyong on 2016/5/19.
 */
public @interface comment {
    String description() default "this is a desc";
//    String targetDate();
    int es();
//    String additionalNote();
}
