package org.altegox.framework.client;

import org.altegox.framework.service.ChatService;
import org.altegox.framework.service.impl.CombinationServiceImpl;
import org.altegox.framework.api.LangModel;
import org.altegox.framework.api.request.DefaultRequest;
import org.altegox.framework.api.request.Message;
import org.altegox.framework.api.response.ChatResponse;
import org.altegox.framework.api.response.ModelResponse;

import java.util.List;

public class CombinationClient {
    private final ChatService<ChatResponse> service;

    public static CombinationClient create(LangModel langModel) {
        return new CombinationClient(langModel);
    }

    protected CombinationClient(LangModel model) {
        this.service = new CombinationServiceImpl(model);
    }

    public String generate(String message) {
        return service.generate(message);
    }

    public ModelResponse<ChatResponse> chat(List<Message> messages) {
        return service.chat(messages);
    }

    public <R extends DefaultRequest> ModelResponse<ChatResponse> chat(R request) {
        return service.chat(request);
    }
}
