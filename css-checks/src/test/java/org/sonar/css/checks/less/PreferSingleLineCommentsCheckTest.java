/*
 * SonarQube CSS / SCSS / Less Analyzer
 * Copyright (C) 2013-2016 David RACODON
 * mailto: david.racodon@gmail.com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package org.sonar.css.checks.less;

import org.junit.Test;
import org.sonar.css.checks.CheckTestUtils;
import org.sonar.css.checks.verifier.CssCheckVerifier;

public class PreferSingleLineCommentsCheckTest {

  private static final String MESSAGE = "Replace this multi-line comment with single-line comments.";

  @Test
  public void test() {
    CssCheckVerifier.issuesOnLessFile(
      new PreferSingleLineCommentsCheck(),
      CheckTestUtils.getLessTestFile("preferSingleLineComments.less"))
      .next().atLine(2).withMessage(MESSAGE)
      .next().atLine(4).withMessage(MESSAGE)
      .next().atLine(5).withMessage(MESSAGE)
      .noMore();
  }

}
