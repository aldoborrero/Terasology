/*
 * Copyright 2012
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.terasology.game.client;

import org.terasology.entitySystem.EntityRef;
import org.terasology.events.input.AxisEvent;

/**
 * @author Immortius
 */
public class BindAxisEvent extends AxisEvent {

    private String id;
    private float value;

    public BindAxisEvent() {
        super(0, EntityRef.NULL);
    }

    @Override
    public float getValue() {
        return value;
    }

    void prepare(String id, float value, float delta, EntityRef target) {
        reset(delta, target);
        this.id = id;
        this.value = value;
    }

    public String getId() {
        return id;
    }

}
