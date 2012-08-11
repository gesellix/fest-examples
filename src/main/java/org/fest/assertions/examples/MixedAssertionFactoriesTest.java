package org.fest.assertions.examples;

import org.junit.Test;

import java.awt.*;
import java.awt.image.BufferedImage;

import static java.awt.image.BufferedImage.TYPE_INT_RGB;
import static org.fest.assertions.api.Assertions.assertThat;
import static org.fest.assertions.api.AwtAssertions.assertThat;

public class MixedAssertionFactoriesTest {

  @Test
  public void testCoreAssertions() {
    String someTestString = "<example/>";
    assertThat(someTestString).contains("example");
  }

  @Test
  public void testAwtAssertions() {
    BufferedImage image = new BufferedImage(10, 10, TYPE_INT_RGB);
    assertThat(image).hasSize(new Dimension(10, 10));
  }
}
