package Task6;

import com.sun.source.tree.Tree;

import java.util.Map;
import java.util.TreeMap;
import java.io.*;
import java.util.*;

public class TreeMapoo {

    private TreeMap<String, String> map;

    public TreeMapoo(){
        this.map = new TreeMap<String, String>();

    }

    public  void put(String key, String value){
        this.map.put(key, value);
    }

    public void lastFirstElement(){

        System.out.println("The first key value pair is : " + map.pollFirstEntry());
        System.out.println("The largest key value pair is : " + map.pollLastEntry());


    }


}
