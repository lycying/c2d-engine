package info.u250.c2d.engine.events;

/**
 * Base class to use when registering a listener for an event.
 *
 * @author xjjdog
 */
public abstract class EventListener {
    /**
     * Call this every delta
     */
    public abstract void onEvent(Event event);
}