package Model.core;

import java.io.Serializable;

public interface BaseEntity<I> extends Serializable {
  I getId();
}

