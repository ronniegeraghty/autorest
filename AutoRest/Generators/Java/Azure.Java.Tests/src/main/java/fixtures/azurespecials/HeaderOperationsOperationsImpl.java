/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.14.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azurespecials;

import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceResponseBuilder;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponseCallback;
import com.microsoft.rest.ServiceResponseWithHeaders;
import com.squareup.okhttp.ResponseBody;
import fixtures.azurespecials.models.ErrorException;
import fixtures.azurespecials.models.HeaderCustomNamedRequestIdHeaders;
import java.io.IOException;
import retrofit.Call;
import retrofit.Response;
import retrofit.Retrofit;

/**
 * An instance of this class provides access to all the operations defined
 * in HeaderOperationsOperations.
 */
public final class HeaderOperationsOperationsImpl implements HeaderOperationsOperations {
    /** The Retrofit service to perform REST calls. */
    private HeaderOperationsService service;
    /** The service client containing this operation class. */
    private AutoRestAzureSpecialParametersTestClient client;

    /**
     * Initializes an instance of HeaderOperationsOperations.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public HeaderOperationsOperationsImpl(Retrofit retrofit, AutoRestAzureSpecialParametersTestClient client) {
        this.service = retrofit.create(HeaderOperationsService.class);
        this.client = client;
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request.
     *
     * @param fooClientRequestId The fooRequestId
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    public ServiceResponseWithHeaders<Void, HeaderCustomNamedRequestIdHeaders> customNamedRequestId(String fooClientRequestId) throws ErrorException, IOException, IllegalArgumentException {
        if (fooClientRequestId == null) {
            throw new IllegalArgumentException("Parameter fooClientRequestId is required and cannot be null.");
        }
        Call<ResponseBody> call = service.customNamedRequestId(fooClientRequestId, this.client.getAcceptLanguage());
        return customNamedRequestIdDelegate(call.execute(), null);
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request.
     *
     * @param fooClientRequestId The fooRequestId
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> customNamedRequestIdAsync(String fooClientRequestId, final ServiceCallback<Void> serviceCallback) {
        if (fooClientRequestId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter fooClientRequestId is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.customNamedRequestId(fooClientRequestId, this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(customNamedRequestIdDelegate(response, retrofit));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponseWithHeaders<Void, HeaderCustomNamedRequestIdHeaders> customNamedRequestIdDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ErrorException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Void, ErrorException>()
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .buildWithHeaders(response, retrofit, HeaderCustomNamedRequestIdHeaders.class);
    }

}
