package assignment;

public class Set<T> {
  private T[] set = (T[]) new Object[32];

  public void add(T item) { // O(n)
    int firstFreeSpot = -1; // O(1)
    for (int i = 0; i<set.length; i++) { // O(n)
      if (set[i] == item) { // O(1)
        return;
      }
      if (set[i] == null && firstFreeSpot == -1) { // O(1)
        firstFreeSpot = i; // O(1)
      }
    }
    set[firstFreeSpot] = item;  // O(1)
  }

  public boolean contains(T item) { // O(n)
    for (T currentItem: set) { // O(n)
      if (currentItem == item) { // O(1)
        return true;
      }
    }
    return false;
  }

  public void remove(T item) { // O(n)
    for (int i = 0; i < set.length; i++) { // O(n)
      if (set[i] == item) { // O(1)
        set[i] = null; // O(1)
        return;
      }
    }
  }

  public int size() { // O(n)
    int nullCount = 0; // O(1)
    for (int i = 0; i < set.length; i++) { // O(n)
      if (set[i] == null) { // O(1)
        nullCount++; // O(1)
      }
    }
    return set.length - nullCount;
  }
}
