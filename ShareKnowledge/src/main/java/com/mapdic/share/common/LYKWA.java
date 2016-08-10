package com.mapdic.share.common;

import com.mapdic.share.model.Knowledge;

import java.util.*;

/**
 * Created by liuyong on 2016/4/9.
 */
public class LYKWA {

    public  LinkedHashMap sortMap(Map oldMap) {
        ArrayList<Map.Entry<Knowledge, Double>> list = new ArrayList<Map.Entry<Knowledge, Double>>(oldMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Knowledge, Double>>() {

            @Override
            public int compare(Map.Entry<Knowledge, Double> arg0,
                               Map.Entry<Knowledge, Double> arg1) {
                if(arg1.getValue() == arg0.getValue())
                   return arg1.getKey().getOrcontent().length() - arg0.getKey().getOrcontent().length()==0?
                           arg1.getKey().getContent().length() - arg0.getKey().getContent().length():
                           arg1.getKey().getOrcontent().length() - arg0.getKey().getOrcontent().length();
                  return arg1.getValue().compareTo( arg0.getValue());
            }
        });
        LinkedHashMap<Knowledge, Double> newMap = new LinkedHashMap();
        for (int i = 0; i < list.size(); i++) {
            newMap.put(list.get(i).getKey(), list.get(i).getValue());
        }
        return newMap;
    }
    public LinkedList<Knowledge> lyKeywordAlgorithm(String[] keywords,  List<Knowledge> knowledgeList){
        LinkedList<Knowledge> knowledges = new LinkedList<>();
        Map<Knowledge,Double> map = new HashMap<>();
        for(Knowledge knowledge : knowledgeList){
            map.put(knowledge,0.0);
        }
        for(String str : keywords){
            for(Knowledge knowledge : knowledgeList){
                if(knowledge.getTitle().toLowerCase().contains(str.toLowerCase())){
                    map.put(knowledge, map.get(knowledge) +  2);
                }

                if(knowledge.getTag().toLowerCase().contains(str.toLowerCase())){
                    map.put(knowledge, map.get(knowledge) +  1);
                }

                if (knowledge.getOrcontent().toLowerCase().contains(str)) {
                    double num = getKeyWrodsCount(str, knowledge.getOrcontent());
                    num = num * 0.5;
                    map.put(knowledge, map.get(knowledge) +  num);
                }
            }
        }
        Iterator it = sortMap(map).entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Knowledge, Double> entry = (Map.Entry<Knowledge, Double>) it.next();
            //System.out.println(entry.getKey().toString() + " " + entry.getValue());
            if(entry.getValue() != 0.0){
                knowledges.add(entry.getKey());
            }
        }
        return knowledges;
    }
    private int getKeyWrodsCount(String keyword, String content) {
        return content.split(keyword).length;
    }
}
