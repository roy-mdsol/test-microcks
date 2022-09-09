package org.roy;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import org.roy.beans.Visit;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/visits")
public interface VisitsResource {
  /**
   * Gets a list of all `Visit` entities.
   */
  @GET
  @Produces("application/json")
  List<Visit> getVisits();

  /**
   * Creates a new instance of a `Visit`.
   */
  @POST
  @Consumes("application/json")
  void createVisit(Visit data);

  /**
   * Gets the details of a single instance of a `Visit`.
   */
  @Path("/{visitId}")
  @GET
  @Produces("application/json")
  Visit getVisit(@PathParam("visitId") String visitId);

  /**
   * Updates an existing `Visit`.
   */
  @Path("/{visitId}")
  @PUT
  @Consumes("application/json")
  void updateVisit(@PathParam("visitId") String visitId, Visit data);

  /**
   * Deletes an existing `Visit`.
   */
  @Path("/{visitId}")
  @DELETE
  void deleteVisit(@PathParam("visitId") String visitId);
}
