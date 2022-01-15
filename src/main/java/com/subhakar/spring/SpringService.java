package com.subhakar.spring;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnBean(name = {"requiredBean", "anotherRequiredBean"})
public class SpringService {
}
