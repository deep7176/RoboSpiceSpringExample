package com.zhylin.prototypes.robospicespring;

import com.octo.android.robospice.request.springandroid.SpringAndroidSpiceRequest;
import com.zhylin.prototypes.robospicespring.model.ResultList;

/**
 * Created by deeptaco on 2/29/16.
 */

public class MyRequest extends SpringAndroidSpiceRequest<ResultList> {

    private String user;

    public MyRequest(String user) {
        super(ResultList.class);
        this.user = user;
    }

    @Override
    public ResultList loadDataFromNetwork() throws Exception {
        String url = "http://jsonplaceholder.typicode.com/posts";
        return getRestTemplate().getForObject(url, ResultList.class);
    }

    /**
     * This method generates a unique cache key for this request. In this case
     * our cache key depends just on the keyword.
     * @return
     */
    public String createCacheKey() {
        return "followers." + user;
    }
}