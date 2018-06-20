package com.pleier.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.pleier.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import rx.Observable;


/**
 * @author : pleier
 * @date : 2018/6/20
 */
@Service
public class AggregationService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallback")
    public Observable<User> getUserById(Long id) {
        //创建一个被观察者
        return Observable.create(observable -> {
            //请求用户微服务的id端点
            User user = restTemplate.getForObject("http://microservice-provider-user/{id}", User.class, id);
            observable.onNext(user);
            observable.onCompleted();
        });
    }

    @HystrixCommand(fallbackMethod = "fallback")
    public Observable<User> getMovieUserByUserId(Long id) {
        //创建一个被观察者
        return Observable.create(observable -> {
            //请求电影微服务的user/({id}端点
            User movieUser = restTemplate.getForObject("http://microservice-provider-user/{id}", User.class, id);
            observable.onNext(movieUser);
            observable.onCompleted();
        });
    }

    public User fallback(Long id) {
        User user = new User();
        user.setId(-1L);
        user.setName("默认用户");
        return user;
    }
}
