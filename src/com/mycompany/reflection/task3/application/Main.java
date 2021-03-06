package com.mycompany.reflection.task3.application;

import com.mycompany.reflection.task3.models.ObjectItem;
import com.mycompany.reflection.task3.models.User;
import com.mycompany.reflection.task3.models.UserObject;
import com.mycompany.reflection.task3.serializer.Serializer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ObjectItem objectItem = new ObjectItem("ItemStr", 1);
        UserObject userObject = new UserObject("String field", 12, new Date(), objectItem);

        List<String> list = new ArrayList<String>(Arrays.asList(new String[]{"first", "second"}));

        User user = new User(1, "Stas", "Ryabokon",
                new Date(), "Kyiv", userObject, list);

        Serializer.serialize(user);

//        User newUser = (User) Serializer.deserialize(User.class);
//
//        System.out.println(newUser);

    }


}
