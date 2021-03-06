/* Copyright 2014 Sheldon Neilson www.neilson.co.za
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 */
package za.co.neilson.sqlite.orm.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>
 * Use the PrimaryKey annotation to designate an object's property as it's
 * primary key. Primary key fields cannot be stored with null values and must be
 * unique. If the field is numeric, the optional autoIncrement parameter can be set to
 * true, in which case dataase will automatically assign a sequential numeric
 * value to new objects inserted into the database.
 * </p>
 * <p>
 * This primary key will also be used in mapping objects to their
 * corresponding database records during update and delete operations.
 * </p>
 * 
 * @param autoIncrement
 *            the object name / table name to which the foreign key reference
 *            relates
 * @version 0.1
 * @since 0.1
 * @author <a href="http://www.neilson.co.za">Sheldon Neilson</a>
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface PrimaryKey {
	boolean autoIncrement() default false;
}