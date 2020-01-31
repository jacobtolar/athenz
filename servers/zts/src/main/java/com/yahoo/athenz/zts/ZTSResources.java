//
// This file generated by rdl 1.5.2. Do not modify!
//
package com.yahoo.athenz.zts;

import com.yahoo.rdl.*;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.inject.Inject;

@Path("/v1")
public class ZTSResources {

    @GET
    @Path("/access/{action}/{resource}")
    @Produces(MediaType.APPLICATION_JSON)
    public ResourceAccess getResourceAccess(@PathParam("action") String action, @PathParam("resource") String resource, @QueryParam("domain") String domain, @QueryParam("principal") String checkPrincipal) {
        try {
            ResourceContext context = this.delegate.newResourceContext(this.request, this.response);
            context.authenticate();
            return this.delegate.getResourceAccess(context, action, resource, domain, checkPrincipal);
        } catch (ResourceException e) {
            int code = e.getCode();
            switch (code) {
            case ResourceException.BAD_REQUEST:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.FORBIDDEN:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.NOT_FOUND:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.UNAUTHORIZED:
                throw typedException(code, e, ResourceError.class);
            default:
                System.err.println("*** Warning: undeclared exception (" + code + ") for resource getResourceAccess");
                throw typedException(code, e, ResourceError.class);
            }
        }
    }

    @GET
    @Path("/access/{action}")
    @Produces(MediaType.APPLICATION_JSON)
    public ResourceAccess getResourceAccessExt(@PathParam("action") String action, @QueryParam("resource") String resource, @QueryParam("domain") String domain, @QueryParam("principal") String checkPrincipal) {
        try {
            ResourceContext context = this.delegate.newResourceContext(this.request, this.response);
            context.authenticate();
            return this.delegate.getResourceAccessExt(context, action, resource, domain, checkPrincipal);
        } catch (ResourceException e) {
            int code = e.getCode();
            switch (code) {
            case ResourceException.BAD_REQUEST:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.FORBIDDEN:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.NOT_FOUND:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.UNAUTHORIZED:
                throw typedException(code, e, ResourceError.class);
            default:
                System.err.println("*** Warning: undeclared exception (" + code + ") for resource getResourceAccessExt");
                throw typedException(code, e, ResourceError.class);
            }
        }
    }

    @GET
    @Path("/domain/{domainName}/service/{serviceName}")
    @Produces(MediaType.APPLICATION_JSON)
    public ServiceIdentity getServiceIdentity(@PathParam("domainName") String domainName, @PathParam("serviceName") String serviceName) {
        try {
            ResourceContext context = this.delegate.newResourceContext(this.request, this.response);
            context.authenticate();
            return this.delegate.getServiceIdentity(context, domainName, serviceName);
        } catch (ResourceException e) {
            int code = e.getCode();
            switch (code) {
            case ResourceException.BAD_REQUEST:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.NOT_FOUND:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.UNAUTHORIZED:
                throw typedException(code, e, ResourceError.class);
            default:
                System.err.println("*** Warning: undeclared exception (" + code + ") for resource getServiceIdentity");
                throw typedException(code, e, ResourceError.class);
            }
        }
    }

    @GET
    @Path("/domain/{domainName}/service")
    @Produces(MediaType.APPLICATION_JSON)
    public ServiceIdentityList getServiceIdentityList(@PathParam("domainName") String domainName) {
        try {
            ResourceContext context = this.delegate.newResourceContext(this.request, this.response);
            context.authenticate();
            return this.delegate.getServiceIdentityList(context, domainName);
        } catch (ResourceException e) {
            int code = e.getCode();
            switch (code) {
            case ResourceException.BAD_REQUEST:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.NOT_FOUND:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.UNAUTHORIZED:
                throw typedException(code, e, ResourceError.class);
            default:
                System.err.println("*** Warning: undeclared exception (" + code + ") for resource getServiceIdentityList");
                throw typedException(code, e, ResourceError.class);
            }
        }
    }

    @GET
    @Path("/domain/{domainName}/service/{serviceName}/publickey/{keyId}")
    @Produces(MediaType.APPLICATION_JSON)
    public PublicKeyEntry getPublicKeyEntry(@PathParam("domainName") String domainName, @PathParam("serviceName") String serviceName, @PathParam("keyId") String keyId) {
        try {
            ResourceContext context = this.delegate.newResourceContext(this.request, this.response);
            context.authenticate();
            return this.delegate.getPublicKeyEntry(context, domainName, serviceName, keyId);
        } catch (ResourceException e) {
            int code = e.getCode();
            switch (code) {
            case ResourceException.BAD_REQUEST:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.NOT_FOUND:
                throw typedException(code, e, ResourceError.class);
            default:
                System.err.println("*** Warning: undeclared exception (" + code + ") for resource getPublicKeyEntry");
                throw typedException(code, e, ResourceError.class);
            }
        }
    }

    @GET
    @Path("/host/{host}/services")
    @Produces(MediaType.APPLICATION_JSON)
    public HostServices getHostServices(@PathParam("host") String host) {
        try {
            ResourceContext context = this.delegate.newResourceContext(this.request, this.response);
            context.authenticate();
            return this.delegate.getHostServices(context, host);
        } catch (ResourceException e) {
            int code = e.getCode();
            switch (code) {
            case ResourceException.BAD_REQUEST:
                throw typedException(code, e, ResourceError.class);
            default:
                System.err.println("*** Warning: undeclared exception (" + code + ") for resource getHostServices");
                throw typedException(code, e, ResourceError.class);
            }
        }
    }

    @GET
    @Path("/domain/{domainName}/signed_policy_data")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getDomainSignedPolicyData(@PathParam("domainName") String domainName, @HeaderParam("If-None-Match") String matchingTag) {
        try {
            ResourceContext context = this.delegate.newResourceContext(this.request, this.response);
            context.authenticate();
            return this.delegate.getDomainSignedPolicyData(context, domainName, matchingTag);
        } catch (ResourceException e) {
            int code = e.getCode();
            switch (code) {
            case ResourceException.BAD_REQUEST:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.NOT_FOUND:
                throw typedException(code, e, ResourceError.class);
            default:
                System.err.println("*** Warning: undeclared exception (" + code + ") for resource getDomainSignedPolicyData");
                throw typedException(code, e, ResourceError.class);
            }
        }
    }

    @GET
    @Path("/domain/{domainName}/token")
    @Produces(MediaType.APPLICATION_JSON)
    public RoleToken getRoleToken(@PathParam("domainName") String domainName, @QueryParam("role") String role, @QueryParam("minExpiryTime") Integer minExpiryTime, @QueryParam("maxExpiryTime") Integer maxExpiryTime, @QueryParam("proxyForPrincipal") String proxyForPrincipal) {
        try {
            ResourceContext context = this.delegate.newResourceContext(this.request, this.response);
            context.authenticate();
            return this.delegate.getRoleToken(context, domainName, role, minExpiryTime, maxExpiryTime, proxyForPrincipal);
        } catch (ResourceException e) {
            int code = e.getCode();
            switch (code) {
            case ResourceException.BAD_REQUEST:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.FORBIDDEN:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.NOT_FOUND:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.UNAUTHORIZED:
                throw typedException(code, e, ResourceError.class);
            default:
                System.err.println("*** Warning: undeclared exception (" + code + ") for resource getRoleToken");
                throw typedException(code, e, ResourceError.class);
            }
        }
    }

    @POST
    @Path("/domain/{domainName}/role/{roleName}/token")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public RoleToken postRoleCertificateRequest(@PathParam("domainName") String domainName, @PathParam("roleName") String roleName, RoleCertificateRequest req) {
        try {
            ResourceContext context = this.delegate.newResourceContext(this.request, this.response);
            context.authenticate();
            return this.delegate.postRoleCertificateRequest(context, domainName, roleName, req);
        } catch (ResourceException e) {
            int code = e.getCode();
            switch (code) {
            case ResourceException.BAD_REQUEST:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.FORBIDDEN:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.NOT_FOUND:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.UNAUTHORIZED:
                throw typedException(code, e, ResourceError.class);
            default:
                System.err.println("*** Warning: undeclared exception (" + code + ") for resource postRoleCertificateRequest");
                throw typedException(code, e, ResourceError.class);
            }
        }
    }

    @GET
    @Path("/access/domain/{domainName}/role/{roleName}/principal/{principal}")
    @Produces(MediaType.APPLICATION_JSON)
    public Access getAccess(@PathParam("domainName") String domainName, @PathParam("roleName") String roleName, @PathParam("principal") String principal) {
        try {
            ResourceContext context = this.delegate.newResourceContext(this.request, this.response);
            context.authenticate();
            return this.delegate.getAccess(context, domainName, roleName, principal);
        } catch (ResourceException e) {
            int code = e.getCode();
            switch (code) {
            case ResourceException.BAD_REQUEST:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.FORBIDDEN:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.NOT_FOUND:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.UNAUTHORIZED:
                throw typedException(code, e, ResourceError.class);
            default:
                System.err.println("*** Warning: undeclared exception (" + code + ") for resource getAccess");
                throw typedException(code, e, ResourceError.class);
            }
        }
    }

    @GET
    @Path("/access/domain/{domainName}/principal/{principal}")
    @Produces(MediaType.APPLICATION_JSON)
    public RoleAccess getRoleAccess(@PathParam("domainName") String domainName, @PathParam("principal") String principal) {
        try {
            ResourceContext context = this.delegate.newResourceContext(this.request, this.response);
            context.authenticate();
            return this.delegate.getRoleAccess(context, domainName, principal);
        } catch (ResourceException e) {
            int code = e.getCode();
            switch (code) {
            case ResourceException.BAD_REQUEST:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.NOT_FOUND:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.UNAUTHORIZED:
                throw typedException(code, e, ResourceError.class);
            default:
                System.err.println("*** Warning: undeclared exception (" + code + ") for resource getRoleAccess");
                throw typedException(code, e, ResourceError.class);
            }
        }
    }

    @GET
    @Path("/providerdomain/{providerDomainName}/user/{userName}")
    @Produces(MediaType.APPLICATION_JSON)
    public TenantDomains getTenantDomains(@PathParam("providerDomainName") String providerDomainName, @PathParam("userName") String userName, @QueryParam("roleName") String roleName, @QueryParam("serviceName") String serviceName) {
        try {
            ResourceContext context = this.delegate.newResourceContext(this.request, this.response);
            context.authenticate();
            return this.delegate.getTenantDomains(context, providerDomainName, userName, roleName, serviceName);
        } catch (ResourceException e) {
            int code = e.getCode();
            switch (code) {
            case ResourceException.BAD_REQUEST:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.NOT_FOUND:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.UNAUTHORIZED:
                throw typedException(code, e, ResourceError.class);
            default:
                System.err.println("*** Warning: undeclared exception (" + code + ") for resource getTenantDomains");
                throw typedException(code, e, ResourceError.class);
            }
        }
    }

    @POST
    @Path("/instance/{domain}/{service}/refresh")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Identity postInstanceRefreshRequest(@PathParam("domain") String domain, @PathParam("service") String service, InstanceRefreshRequest req) {
        try {
            ResourceContext context = this.delegate.newResourceContext(this.request, this.response);
            context.authenticate();
            return this.delegate.postInstanceRefreshRequest(context, domain, service, req);
        } catch (ResourceException e) {
            int code = e.getCode();
            switch (code) {
            case ResourceException.BAD_REQUEST:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.FORBIDDEN:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.INTERNAL_SERVER_ERROR:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.NOT_FOUND:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.UNAUTHORIZED:
                throw typedException(code, e, ResourceError.class);
            default:
                System.err.println("*** Warning: undeclared exception (" + code + ") for resource postInstanceRefreshRequest");
                throw typedException(code, e, ResourceError.class);
            }
        }
    }

    @GET
    @Path("/domain/{domainName}/role/{role}/creds")
    @Produces(MediaType.APPLICATION_JSON)
    public AWSTemporaryCredentials getAWSTemporaryCredentials(@PathParam("domainName") String domainName, @PathParam("role") String role, @QueryParam("durationSeconds") Integer durationSeconds, @QueryParam("externalId") String externalId) {
        try {
            ResourceContext context = this.delegate.newResourceContext(this.request, this.response);
            context.authenticate();
            return this.delegate.getAWSTemporaryCredentials(context, domainName, role, durationSeconds, externalId);
        } catch (ResourceException e) {
            int code = e.getCode();
            switch (code) {
            case ResourceException.BAD_REQUEST:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.FORBIDDEN:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.NOT_FOUND:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.UNAUTHORIZED:
                throw typedException(code, e, ResourceError.class);
            default:
                System.err.println("*** Warning: undeclared exception (" + code + ") for resource getAWSTemporaryCredentials");
                throw typedException(code, e, ResourceError.class);
            }
        }
    }

    @POST
    @Path("/ostk/instance/{domain}/{service}/refresh")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Identity postOSTKInstanceRefreshRequest(@PathParam("domain") String domain, @PathParam("service") String service, OSTKInstanceRefreshRequest req) {
        try {
            ResourceContext context = this.delegate.newResourceContext(this.request, this.response);
            context.authenticate();
            return this.delegate.postOSTKInstanceRefreshRequest(context, domain, service, req);
        } catch (ResourceException e) {
            int code = e.getCode();
            switch (code) {
            case ResourceException.BAD_REQUEST:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.FORBIDDEN:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.INTERNAL_SERVER_ERROR:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.NOT_FOUND:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.UNAUTHORIZED:
                throw typedException(code, e, ResourceError.class);
            default:
                System.err.println("*** Warning: undeclared exception (" + code + ") for resource postOSTKInstanceRefreshRequest");
                throw typedException(code, e, ResourceError.class);
            }
        }
    }

    @POST
    @Path("/instance")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response postInstanceRegisterInformation(InstanceRegisterInformation info) {
        try {
            ResourceContext context = this.delegate.newResourceContext(this.request, this.response);
            context.authenticate();
            return this.delegate.postInstanceRegisterInformation(context, info);
        } catch (ResourceException e) {
            int code = e.getCode();
            switch (code) {
            case ResourceException.BAD_REQUEST:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.FORBIDDEN:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.INTERNAL_SERVER_ERROR:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.NOT_FOUND:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.UNAUTHORIZED:
                throw typedException(code, e, ResourceError.class);
            default:
                System.err.println("*** Warning: undeclared exception (" + code + ") for resource postInstanceRegisterInformation");
                throw typedException(code, e, ResourceError.class);
            }
        }
    }

    @POST
    @Path("/instance/{provider}/{domain}/{service}/{instanceId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public InstanceIdentity postInstanceRefreshInformation(@PathParam("provider") String provider, @PathParam("domain") String domain, @PathParam("service") String service, @PathParam("instanceId") String instanceId, InstanceRefreshInformation info) {
        try {
            ResourceContext context = this.delegate.newResourceContext(this.request, this.response);
            context.authenticate();
            return this.delegate.postInstanceRefreshInformation(context, provider, domain, service, instanceId, info);
        } catch (ResourceException e) {
            int code = e.getCode();
            switch (code) {
            case ResourceException.BAD_REQUEST:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.FORBIDDEN:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.INTERNAL_SERVER_ERROR:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.NOT_FOUND:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.UNAUTHORIZED:
                throw typedException(code, e, ResourceError.class);
            default:
                System.err.println("*** Warning: undeclared exception (" + code + ") for resource postInstanceRefreshInformation");
                throw typedException(code, e, ResourceError.class);
            }
        }
    }

    @DELETE
    @Path("/instance/{provider}/{domain}/{service}/{instanceId}")
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteInstanceIdentity(@PathParam("provider") String provider, @PathParam("domain") String domain, @PathParam("service") String service, @PathParam("instanceId") String instanceId) {
        try {
            ResourceContext context = this.delegate.newResourceContext(this.request, this.response);
            context.authorize("delete", "" + domain + ":instance." + instanceId + "", null);
            this.delegate.deleteInstanceIdentity(context, provider, domain, service, instanceId);
        } catch (ResourceException e) {
            int code = e.getCode();
            switch (code) {
            case ResourceException.BAD_REQUEST:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.FORBIDDEN:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.INTERNAL_SERVER_ERROR:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.NOT_FOUND:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.UNAUTHORIZED:
                throw typedException(code, e, ResourceError.class);
            default:
                System.err.println("*** Warning: undeclared exception (" + code + ") for resource deleteInstanceIdentity");
                throw typedException(code, e, ResourceError.class);
            }
        }
    }

    @GET
    @Path("/cacerts/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public CertificateAuthorityBundle getCertificateAuthorityBundle(@PathParam("name") String name) {
        try {
            ResourceContext context = this.delegate.newResourceContext(this.request, this.response);
            context.authenticate();
            return this.delegate.getCertificateAuthorityBundle(context, name);
        } catch (ResourceException e) {
            int code = e.getCode();
            switch (code) {
            case ResourceException.BAD_REQUEST:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.NOT_FOUND:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.UNAUTHORIZED:
                throw typedException(code, e, ResourceError.class);
            default:
                System.err.println("*** Warning: undeclared exception (" + code + ") for resource getCertificateAuthorityBundle");
                throw typedException(code, e, ResourceError.class);
            }
        }
    }

    @POST
    @Path("/metrics/{domainName}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public DomainMetrics postDomainMetrics(@PathParam("domainName") String domainName, DomainMetrics req) {
        try {
            ResourceContext context = this.delegate.newResourceContext(this.request, this.response);
            context.authenticate();
            return this.delegate.postDomainMetrics(context, domainName, req);
        } catch (ResourceException e) {
            int code = e.getCode();
            switch (code) {
            case ResourceException.BAD_REQUEST:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.FORBIDDEN:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.NOT_FOUND:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.UNAUTHORIZED:
                throw typedException(code, e, ResourceError.class);
            default:
                System.err.println("*** Warning: undeclared exception (" + code + ") for resource postDomainMetrics");
                throw typedException(code, e, ResourceError.class);
            }
        }
    }

    @GET
    @Path("/status")
    @Produces(MediaType.APPLICATION_JSON)
    public Status getStatus() {
        try {
            ResourceContext context = this.delegate.newResourceContext(this.request, this.response);
            context.authenticate();
            return this.delegate.getStatus(context);
        } catch (ResourceException e) {
            int code = e.getCode();
            switch (code) {
            case ResourceException.BAD_REQUEST:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.NOT_FOUND:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.UNAUTHORIZED:
                throw typedException(code, e, ResourceError.class);
            default:
                System.err.println("*** Warning: undeclared exception (" + code + ") for resource getStatus");
                throw typedException(code, e, ResourceError.class);
            }
        }
    }

    @POST
    @Path("/sshcert")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response postSSHCertRequest(SSHCertRequest certRequest) {
        try {
            ResourceContext context = this.delegate.newResourceContext(this.request, this.response);
            context.authenticate();
            return this.delegate.postSSHCertRequest(context, certRequest);
        } catch (ResourceException e) {
            int code = e.getCode();
            switch (code) {
            case ResourceException.BAD_REQUEST:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.FORBIDDEN:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.INTERNAL_SERVER_ERROR:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.UNAUTHORIZED:
                throw typedException(code, e, ResourceError.class);
            default:
                System.err.println("*** Warning: undeclared exception (" + code + ") for resource postSSHCertRequest");
                throw typedException(code, e, ResourceError.class);
            }
        }
    }

    @GET
    @Path("/oauth2/keys")
    @Produces(MediaType.APPLICATION_JSON)
    public JWKList getJWKList(@QueryParam("rfc") @DefaultValue("false") Boolean rfc) {
        try {
            ResourceContext context = this.delegate.newResourceContext(this.request, this.response);
            context.authenticate();
            return this.delegate.getJWKList(context, rfc);
        } catch (ResourceException e) {
            int code = e.getCode();
            switch (code) {
            case ResourceException.BAD_REQUEST:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.NOT_FOUND:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.UNAUTHORIZED:
                throw typedException(code, e, ResourceError.class);
            default:
                System.err.println("*** Warning: undeclared exception (" + code + ") for resource getJWKList");
                throw typedException(code, e, ResourceError.class);
            }
        }
    }

    @POST
    @Path("/oauth2/token")
    @Consumes("application/x-www-form-urlencoded")
    @Produces(MediaType.APPLICATION_JSON)
    public AccessTokenResponse postAccessTokenRequest(String request) {
        try {
            ResourceContext context = this.delegate.newResourceContext(this.request, this.response);
            context.authenticate();
            return this.delegate.postAccessTokenRequest(context, request);
        } catch (ResourceException e) {
            int code = e.getCode();
            switch (code) {
            case ResourceException.BAD_REQUEST:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.FORBIDDEN:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.NOT_FOUND:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.UNAUTHORIZED:
                throw typedException(code, e, ResourceError.class);
            default:
                System.err.println("*** Warning: undeclared exception (" + code + ") for resource postAccessTokenRequest");
                throw typedException(code, e, ResourceError.class);
            }
        }
    }

    @POST
    @Path("/rolecert")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public RoleCertificate postRoleCertificateRequestExt(RoleCertificateRequest req) {
        try {
            ResourceContext context = this.delegate.newResourceContext(this.request, this.response);
            context.authenticate();
            return this.delegate.postRoleCertificateRequestExt(context, req);
        } catch (ResourceException e) {
            int code = e.getCode();
            switch (code) {
            case ResourceException.BAD_REQUEST:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.FORBIDDEN:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.NOT_FOUND:
                throw typedException(code, e, ResourceError.class);
            case ResourceException.UNAUTHORIZED:
                throw typedException(code, e, ResourceError.class);
            default:
                System.err.println("*** Warning: undeclared exception (" + code + ") for resource postRoleCertificateRequestExt");
                throw typedException(code, e, ResourceError.class);
            }
        }
    }

    @GET
    @Path("/schema")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema getRdlSchema() {
        try {
            ResourceContext context = this.delegate.newResourceContext(this.request, this.response);
            context.authenticate();
            return this.delegate.getRdlSchema(context);
        } catch (ResourceException e) {
            int code = e.getCode();
            switch (code) {
            default:
                System.err.println("*** Warning: undeclared exception (" + code + ") for resource getRdlSchema");
                throw typedException(code, e, ResourceError.class);
            }
        }
    }


    WebApplicationException typedException(int code, ResourceException e, Class<?> eClass) {
        Object data = e.getData();
        Object entity = eClass.isInstance(data) ? data : null;
        if (entity != null) {
            return new WebApplicationException(Response.status(code).entity(entity).build());
        } else {
            return new WebApplicationException(code);
        }
    }

    @Inject private ZTSHandler delegate;
    @Context private HttpServletRequest request;
    @Context private HttpServletResponse response;
    
}
