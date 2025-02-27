package org.altego.api;


import org.altego.framework.client.ChatClient;

public class OpenaiClient extends ChatClient<OpenaiModel> {

    private OpenaiClient(OpenaiModel openaiModel) {
        super(openaiModel);
    }

    public static OpenaiClient create(OpenaiModel openaiModel) {
        return new OpenaiClient(openaiModel);
    }

}
