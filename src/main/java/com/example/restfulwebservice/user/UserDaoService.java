package com.example.restfulwebservice.user;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

// 비즈니스 로직이나 DB에 관련된 것은 Service 클래스에 추가

@Service    // 더 명확하게
// @Component가능
public class UserDaoService {
    private static List<User> users = new ArrayList<>();

    private static int userCount = 3;

    static {
        users.add(new User(1, "dk", new Date()));
        users.add(new User(2, "suarez", new Date()));
        users.add(new User(3, "jhon", new Date()));

    }

    // 사용자 전체 조회
    public List<User> findAll() {
        return users;
    }

    public User save(User user){
        if (user.getId() == null){
            user.setId(++userCount);
        }
        users.add(user);
        return user;
    }

    // 사용자 개별 데이터를 반환
    public User findOne(int id){
        for (User user : users) {
            if (user.getId() == id){
                return user;
            }
        }
        return null;
    }

    public User deleteById(int id){
        Iterator<User> iterator = users.iterator();

        while(iterator.hasNext()){
            User user = iterator.next();

            if (user.getId() == id) {
                iterator.remove();
                return user;
            }
        }
        return null;
    }
}
