package com.samvbeckmann.paritydemo;

import com.samvbeckmann.parity.ParitySubscribe;
import com.samvbeckmann.parity.RegisterType;

import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates how to use {@link ParitySubscribe} to register classes.
 *
 * @author Sam Beckmann & Nate Beckemeyer
 */
@ParitySubscribe
public class DemoHandler
{
    /**
     * Registers Interaction Handlers
     *
     * @return A list of classes of Interaction Handlers to be registered.
     */
    @ParitySubscribe.RegisterClasses(RegisterType.INTERACTION_HANDLER)
    public List<Class> registerInteractionHandlers()
    {
        List<Class> interactionHandlers = new ArrayList<>();
        interactionHandlers.add(DemoInteractionHandler.class);
        return interactionHandlers;
    }

    /**
     * Registers Completion Conditions.
     *
     * @return A list of classes of Completion Conditions to be registered.
     */
    @ParitySubscribe.RegisterClasses(RegisterType.COMPLETION_CONDITION)
    public List<Class> registerCompletionConditions()
    {
        List<Class> completionConditions = new ArrayList<>();
        completionConditions.add(DemoCompletionCondition.class);
        return completionConditions;
    }

    /**
     * Registers Agents.
     *
     * @return A list of classes of Agents to be registered.
     */
    @ParitySubscribe.RegisterClasses(RegisterType.AGENT)
    public List<Class> registerAgents()
    {
        List<Class> agents = new ArrayList<>();
        agents.add(DemoAgent.class);
        return agents;
    }
}
