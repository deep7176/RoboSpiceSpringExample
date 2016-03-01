package com.zhylin.prototypes.robospicespring;

import com.octo.android.robospice.request.springandroid.SpringAndroidSpiceRequest;
import com.zhylin.prototypes.robospicespring.model.FollowerList;

/**
 * Created by deeptaco on 2/29/16.
 */

public class FollowersRequest extends SpringAndroidSpiceRequest<FollowerList> {

    private String user;

    public FollowersRequest(String user) {
        super(FollowerList.class);
        this.user = user;
    }

    @Override
    public FollowerList loadDataFromNetwork() throws Exception {

        String url = String.format("https://api.github.com/users/%s/followers",
                user);

        return getRestTemplate().getForObject(url, FollowerList.class);
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