package Zoo.resources;

import Zoo.manager.AnimalManager;
import Zoo.manager.DestroyAnimalManager;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("animals")
@Produces(MediaType.APPLICATION_JSON)
public class AnimalResources {

    private static ArrayList<String> animals
            = new ArrayList<>();
    @GET
    public Response getAll(){
        return Response.ok(animals).build();
    }

    @POST
    public Response create(AnimalManager animal){
        animals.add(animal);
        return Response.ok().build();
    }
    @DELETE
    public Response destroy(String deadAnimal){
        animals.remove(deadAnimal);
        return Response.ok().build();
    }

}
