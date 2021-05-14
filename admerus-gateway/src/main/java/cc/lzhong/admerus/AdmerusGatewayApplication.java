package cc.lzhong.admerus;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringCloudApplication
public class AdmerusGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdmerusGatewayApplication.class, args);
    }

}
