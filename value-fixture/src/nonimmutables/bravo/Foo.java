package nonimmutables.bravo;

import org.immutables.value.Value;

@Value.Immutable
public interface Foo {
  String getName();
}