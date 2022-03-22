package pattern.behavioral.iterator;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}