package com.domainforge.event.listener;

import com.domainforge.agent.DomainForge;
import com.domainforge.agent.DomainForgeFactory;
import com.domainforge.event.ChatEvent;
import lombok.AllArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ChatEventListener {

    private final DomainForgeFactory DomainForgeFactory;

    @Async
    @EventListener
    public void handle(ChatEvent event) {
        // 创建一个 Agent 实例处理聊天事件
        DomainForge DomainForge = DomainForgeFactory.create(event.getAgentId(), event.getSessionId());
        DomainForge.run();
    }
}
