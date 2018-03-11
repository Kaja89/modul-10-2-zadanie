package com.kodilla.spring2.reader;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.time.LocalDate;

public class IfDayIsOddCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotadedTypeMetadata){
        return LocalDate.now().getDayOfMonth() % 2 != 0;
    }
}
