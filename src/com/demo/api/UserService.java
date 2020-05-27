package com.demo.api;

import com.demo.model.Message;
import com.demo.model.User;

import javax.ws.rs.*;
import java.util.ArrayList;
import java.util.List;

@Path("/users")
public class UserService {
    @GET
    @Produces("application/json")
    @Consumes("application/x-www-form-urlencoded")
    public List<User> getUser()
    {
        List<User> list= new ArrayList<>();
        User user = new User(1,"Nguyen Van A","123","123456");
        User user2 = new User(2,"Nguyen Van B","123","123456");
        list.add(user);
        list.add(user2);
        return list;
    }

    @GET
    @Path("/{id}")
    @Produces("application/json")
    public User getUser(@PathParam("id") int id)
    {
        User user = new User(id,"Quang Teo","123","123456");
        return user;
    }

    @POST
    @Produces("application/json")
    @Consumes("application/json")
    public User createUser(User user)
    {
        return user;
    }

    @PUT
    @Path("/{id}")
    @Produces("application/json") //Request
    @Consumes("application/json") //Response
    public User updateUser(@PathParam("id") int id, User user)
    {
        return user;
    }

    @DELETE
    @Path("/{id}")
    @Produces("application/json")
    public Message deleteUser(@PathParam("id") int id)
    {
        Message mes = new Message(1,"success");
        return mes;
    }

}
