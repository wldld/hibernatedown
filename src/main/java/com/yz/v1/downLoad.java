package com.yz.v1;

import com.yz.entity.Wallpaper;

import java.util.Iterator;
import java.util.List;

public class downLoad {
    public static void main(String[] args) {
        //for循环：将第一条查询记录发去
//        for(int i = 0;i<300;i+=10)
//        for循环主体
        int i = 0;

        List<Wallpaper> list =dao.select(0);
        Iterator it = list.iterator();
        while (it.hasNext()){
            Wallpaper wallpaper =(Wallpaper) it.next();
            String str = wallpaper.getImgUrl();
            String fileName = wallpaper.getId();
            okHttp.okIO(fileName,str);
        }
    }


}
