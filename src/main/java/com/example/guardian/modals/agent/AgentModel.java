package com.example.guardian.modals.agent;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AgentModel {

    private Integer id;
    private String customerIp;
    private String customerUserAgent;
    private String merchantIp;

}
