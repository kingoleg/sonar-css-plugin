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
package org.sonar.css.model.property.standard;

import org.sonar.css.model.function.standard.Rect;
import org.sonar.css.model.property.StandardProperty;
import org.sonar.css.model.property.validator.ValidatorFactory;
import org.sonar.css.model.property.validator.valueelement.function.FunctionValidator;

public class Clip extends StandardProperty {

  public Clip() {
    addLinks(
      "https://www.w3.org/TR/CSS22/visufx.html#propdef-clip",
      "https://drafts.fxtf.org/masking/#propdef-clip");
    addValidators(new FunctionValidator(Rect.class), ValidatorFactory.getAutoValidator());
  }

}
