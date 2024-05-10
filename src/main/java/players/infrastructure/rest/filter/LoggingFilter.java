package players.infrastructure.rest.filter;

import io.quarkus.logging.Log;
import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerRequestFilter;
import jakarta.ws.rs.container.ContainerResponseContext;
import jakarta.ws.rs.container.ContainerResponseFilter;
import jakarta.ws.rs.ext.Provider;

import java.io.*;
import java.util.stream.Collectors;

@Provider
public class LoggingFilter implements ContainerRequestFilter, ContainerResponseFilter {
    @Override
    public void filter(ContainerRequestContext containerRequestContext) throws IOException {
        Log.info(containerRequestContext.getMediaType());
        Log.info(new BufferedReader(new InputStreamReader(containerRequestContext.getEntityStream())).lines().collect(Collectors.joining("\n")));
    }

    @Override
    public void filter(ContainerRequestContext containerRequestContext, ContainerResponseContext containerResponseContext) throws IOException {
        Log.info(containerResponseContext);
    }
}
