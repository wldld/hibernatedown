package com.yz.v1;

import okhttp3.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class okHttp {
    public static void okIO(String fileName,String str){
        //创建okHttpClient对象
        OkHttpClient mOkHttpClient = new OkHttpClient();
//创建一个Request
        final Request request = new Request.Builder()
                .url(str)
                .build();
//new call
        Call call = mOkHttpClient.newCall(request);
//请求加入调度
        call.enqueue(new Callback()
        {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                byte[] data = response.body().bytes();
                OutputStream os = new FileOutputStream("E:\\temp\\images\\"+fileName+".jpg");
                os.write(data);
            }
        });
    }
}
