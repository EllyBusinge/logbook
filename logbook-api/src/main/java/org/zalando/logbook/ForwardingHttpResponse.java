package org.zalando.logbook;

import org.apiguardian.api.API;

import static org.apiguardian.api.API.Status.STABLE;

@API(status = STABLE)
public interface ForwardingHttpResponse extends ForwardingHttpMessage, ForwardingBaseHttpResponse, HttpResponse {

    @Override
    HttpResponse delegate();

}
