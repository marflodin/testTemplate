package com.marflo.testtemplate.webservices;

import com.google.gson.Gson;
import com.marflo.testtemplate.entity.TestEntity;

import javax.ejb.Stateless;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Stateless
@Path("/test")
public class TestWebServiceImpl implements TestWebService {

    Gson gson = new Gson();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getTests() {
        List<TestEntity> testEntities = new ArrayList<TestEntity>();
        String responseData = gson.toJson(testEntities);
        return Response.ok(responseData, MediaType.APPLICATION_JSON).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addTest() {
        String responseData = "Test successfully added with Id";
        return Response.ok(responseData).build();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getTest() {
        TestEntity testEntity = new TestEntity();
        String responseData = gson.toJson(testEntity);
        return Response.ok(responseData, MediaType.APPLICATION_JSON).build();
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateTest(@PathParam("id") Long testId) {
        String responseData = String.format("Test with id %d successfully updated", testId);
        return Response.ok(responseData).build();
    }

    @DELETE
    @Path("/{id}")
    public Response deleteTest(@PathParam("id") Long testId) {
        String responseData = "Test successfully updated";
        return Response.ok(responseData).build();
    }
}
