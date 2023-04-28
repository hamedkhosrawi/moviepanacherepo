package org.home.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class MovieExceptionMapper implements ExceptionMapper<MovieException> {
    @Override
    public Response toResponse(MovieException exception) {
        return null;
    }
}
