package c4soa.adapter;

import cloudfoundry.ClientHelper;
import cloudfoundry.DatabaseObject;
import eu.cloud4soa.adapter.rest.common.HttpStatus;
import eu.cloud4soa.adapter.rest.request.CreateDatabaseRequest;
import eu.cloud4soa.adapter.rest.response.*;
import eu.cloud4soa.adapter.rest.response.model.Database;
import eu.cloud4soa.adapter.rest.response.model.Module;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.MessageContext;

@Path("/c4s")
public class Adapter {

    @Context
    private MessageContext context;
    private static String api_key = "atos@atoscf.com"; //email from CloudFoundry account
    private static String api_secret = "4to5cf"; //password from CloudFoundry account  

    private void headerProcessing() {
        HttpHeaders headers = context.getHttpHeaders();
        List<String> api_key_list = headers.getRequestHeader("apiKey");
        System.out.println("listappheader_api:" + api_key_list);
        String api_as_string = api_key_list.get(0);
        System.out.println("api_as_string:" + api_as_string);
        String splitedStr[] = api_as_string.split("_");
        api_key = splitedStr[0];
        api_secret = splitedStr[1];

        System.out.println("publickey---" + api_key);
        System.out.println("privatekey---" + api_secret);
    }

    @GET
    @Path("/ems/application")
    @Produces({"application/json", "application/xml", "text/plain"})
    public ListApplicationResponse listApplications() {

        ListApplicationResponse response = new ListApplicationResponse();

        try {
            ClientHelper FoundryClient = new ClientHelper();
            headerProcessing();

            response = FoundryClient.ApplicationsList(api_key, api_secret);
            response.setStatusCode(HttpStatus.OK);

        } catch (Exception ex) {
            Logger.getLogger(Adapter.class.getName()).log(Level.SEVERE, null, ex);
            response.setStatusCode(HttpStatus.Expectation_Failed);
        }

        return response;
    }

    @GET
    @Path("/ems/application/{appid}")
    @Produces({"application/json", "application/xml", "text/plain"})
    public ListApplicationResponse getApplicationDetails(@PathParam("appid") String appid) {

        ListApplicationResponse response = new ListApplicationResponse();

        try {

            ClientHelper FoundryClient = new ClientHelper();
            headerProcessing();

            response = FoundryClient.ApplicationInfo(api_key, api_secret, appid);
            response.setStatusCode(HttpStatus.OK);

        } catch (Exception ex) {
            Logger.getLogger(Adapter.class.getName()).log(Level.SEVERE, null, ex);
            response.setStatusCode(HttpStatus.Expectation_Failed);
        }

        return response;
    }

    @POST
    @Path("/ems/application/{app}")
    @Produces({"application/json", "application/xml", "text/plain"})
    public CreateApplicationResponse createApplication(@PathParam("app") c4soa.resource.Application app) {
        return new CreateApplicationResponse();

    }

    @PUT
    @Path("/ems/application/{app}")
    @Produces({"application/json", "application/xml", "text/plain"})
    public UpdateApplicationResponse updateApplication(@PathParam("app") c4soa.resource.Application app) {
        return new UpdateApplicationResponse();
    }

    @DELETE
    @Path("/ems/application/{appid}")
    @Produces({"application/json", "application/xml", "text/plain"})
    public DeleteApplicationResponse deleteApplication(@PathParam("appid") String appid) {

        DeleteApplicationResponse response = new DeleteApplicationResponse();

        try {

            ClientHelper FoundryClient = new ClientHelper();
            headerProcessing();

            String delete_status = FoundryClient.DeleteApplication(api_key, api_secret, appid);
            response.setStatusCode(HttpStatus.OK);

        } catch (Exception ex) {
            Logger.getLogger(Adapter.class.getName()).log(Level.SEVERE, null, ex);
            response.setStatusCode(HttpStatus.Expectation_Failed);
        }

        return response;
    }
    
    @DELETE
    @Path("/ems/application/{appid}/deployment/{deploymentName}")
    @Produces({"application/json", "application/xml", "text/plain"})
     public DeleteDeploymentResponse deleteDeployment(@PathParam("appid") String appid, @PathParam("deploymentName") String deployment) {

        DeleteDeploymentResponse response = new DeleteDeploymentResponse();

        try {

            ClientHelper FoundryClient = new ClientHelper();
            headerProcessing();

            String delete_status = FoundryClient.DeleteApplication(api_key, api_secret, appid);
            response.setStatusCode(HttpStatus.OK);

        } catch (Exception ex) {
            Logger.getLogger(Adapter.class.getName()).log(Level.SEVERE, null, ex);
            response.setStatusCode(HttpStatus.Expectation_Failed);
        }

        return response;
    }

//    @DELETE
//    @Path("/ems/application/{appid}/deployment/{deploymentName}")
//    @Produces({"application/json", "application/xml", "text/plain"})
//    public DeleteDeploymentResponse deleteDeployment(@PathParam("appid") String appid, @PathParam("deploymentName") String deployment) {
//
//        //CLOUDFOUNDRY doesn't supports this
//    }
    @POST
    @Path("/ems/application/{appid}/operation/{op}")
    @Produces({"application/json", "application/xml", "text/plain"})
    public OperationResponse StartStopApplication(@PathParam("appid") String appid, @PathParam("op") String operation) {

        OperationResponse response = new OperationResponse();
        String msg = "";

        try {

            ClientHelper FoundryClient = new ClientHelper();
            headerProcessing();

            //START
            if (operation.equalsIgnoreCase("START")) {
                msg = FoundryClient.StartStopApplication(api_key, api_secret, appid, "START");
            }

            //STOP     
            if (operation.equalsIgnoreCase("STOP")) {
                msg = FoundryClient.StartStopApplication(api_key, api_secret, appid, "STOP");
            }

            response.setMessage(msg);
            response.setStatusCode(HttpStatus.OK);

        } catch (Exception ex) {
            Logger.getLogger(Adapter.class.getName()).log(Level.SEVERE, null, ex);
            response.setStatusCode(HttpStatus.Expectation_Failed);
        }

        return response;
    }

    //DATABASE RELATED METHODS
    @GET
    @Path("/ems/application/{appid}/deployment/{deploymentName}/database/")
    @Produces({"application/json", "application/xml", "text/plain"})
    public ListDatabaseResponse getDBList() {

        ListDatabaseResponse response = new ListDatabaseResponse();

        try {

            ClientHelper FoundryClient = new ClientHelper();
            headerProcessing();

            response = FoundryClient.getDBList(api_key, api_secret);
            response.setStatusCode(HttpStatus.OK);

        } catch (Exception ex) {
            Logger.getLogger(Adapter.class.getName()).log(Level.SEVERE, null, ex);
            response.setStatusCode(HttpStatus.Expectation_Failed);
        }

        return response;

    }

    @GET
    @Path("/ems/application/{appid}/deployment/{deploymentName}/database/{dbid}")
    @Produces({"application/json", "application/xml", "text/plain"})
    public DatabaseResponse getDatabaseDetails(@PathParam("appid") String appid,
            @PathParam("deploymentName") String deploymentName,
            @PathParam("dbid") String dbid) {

        DatabaseResponse response = new DatabaseResponse();
        DatabaseObject dbobj = new DatabaseObject();

        try {

            ClientHelper FoundryClient = new ClientHelper();
            headerProcessing();

            dbobj = FoundryClient.getDBInfo(api_key, api_secret, dbid);

            Database database = new Database();
            database.setDatabaseName(dbobj.getDbname());
            database.setHost(dbobj.getDbhost());
            database.setPort(dbobj.getPort().toString());

            response.setDatabase(database);
            response.setStatusCode(HttpStatus.OK);

        } catch (Exception ex) {
            Logger.getLogger(Adapter.class.getName()).log(Level.SEVERE, null, ex);
            response.setStatusCode(HttpStatus.Expectation_Failed);
        }

        return response;
    }

    @POST
    @Path("/ems/application/{appid}/deployment/{deploymentName}/database/{db}")
    @Produces({"application/json", "application/xml", "text/plain"})
    @Consumes(MediaType.APPLICATION_JSON)
    public CreateDatabaseResponse createDatabase(@PathParam("appid") String appid,
            @PathParam("deploymentName") String deploymentName,
            @PathParam("db") String dbid, CreateDatabaseRequest cdr) {

        CreateDatabaseResponse response = new CreateDatabaseResponse();

        try {

            ClientHelper FoundryClient = new ClientHelper();
            headerProcessing();

            DatabaseObject dbobj = FoundryClient.createDatabase(api_key, api_secret, dbid, appid);

            Database database = new Database();
            database.setDatabaseName(dbobj.getDbname());
            database.setHost(dbobj.getDbhost());
            database.setPort(dbobj.getPort().toString());

            response.setDatabase(database);
            response.setStatusCode(HttpStatus.OK);

        } catch (Exception ex) {
            Logger.getLogger(Adapter.class.getName()).log(Level.SEVERE, null, ex);
            response.setStatusCode(HttpStatus.Expectation_Failed);
        }

        return response;
    }

    @PUT
    @Path("/ems/database/{db}")
    @Produces({"application/json", "application/xml", "text/plain"})
    public UpdateDatabaseResponse updateDatabase(@PathParam("app") String db) {
        return new UpdateDatabaseResponse();
    }

    @DELETE
    @Path("/ems/application/{appid}/deployment/{deploymentName}/database/{dbid}")
    @Produces({"application/json", "application/xml", "text/plain"})
    public DeleteDatabaseResponse deleteDatabase(@PathParam("dbid") String dbid) {

        DeleteDatabaseResponse response = new DeleteDatabaseResponse();

        try {

            ClientHelper FoundryClient = new ClientHelper();
            headerProcessing();

            String delete_status = FoundryClient.deleteDatabase(api_key, api_secret, dbid);
            response.setStatusCode(HttpStatus.OK);

        } catch (Exception ex) {
            Logger.getLogger(Adapter.class.getName()).log(Level.SEVERE, null, ex);
            response.setStatusCode(HttpStatus.Expectation_Failed);
        }

        return response;

    }

    @GET
    @Path("/monitor")
    @Produces({"application/json", "application/xml", "text/plain"})
    public MonitorResponse doMonitoring() {
        MonitorResponse ret = new MonitorResponse();

        Module monitor = new Module();
        monitor.setModuleName("monitor");
        monitor.setDescription("cloud4soa monitoring");
        ret.setModule(monitor);
        return ret;
    }

    @GET
    @Path("/monitor/detail")
    @Produces({"application/json", "application/xml", "text/plain"})
    public MonitorDetailResponse doDetailedMonitoring() {

        MonitorDetailResponse ret = new MonitorDetailResponse();

        ret.setMessage("everything is fine");
        return ret;
    }
}
