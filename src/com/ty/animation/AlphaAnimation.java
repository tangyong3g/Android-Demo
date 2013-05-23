/*
 * Copyright (C) 2006 The Android Open Source Project
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

package com.ty.animation;


/**
 * An animation that controls the alpha level of an object.
 * Useful for fading things in and out. This animation ends up
 * changing the alpha property of a {@link Transformation}
 *
 */
public class AlphaAnimation extends Animation {
    private float mFromAlpha;
    private float mToAlpha;

    /**
     * Constructor to use when building an AlphaAnimation from code
     * 
     * @param fromAlpha Starting alpha value for the animation, where 1.0 means
     *        fully opaque and 0.0 means fully transparent.
     * @param toAlpha Ending alpha value for the animation.
     */
    public AlphaAnimation(float fromAlpha, float toAlpha) {
        mFromAlpha = fromAlpha;
        mToAlpha = toAlpha;
    }
    
    /**
     * Changes the alpha property of the supplied {@link Transformation}
     */
    @Override
    protected void applyTransformation(float interpolatedTime, Transformation t) {
        final float alpha = mFromAlpha;
        t.setAlpha(alpha + ((mToAlpha - alpha) * interpolatedTime));
    }

    @Override
    public boolean willChangeTransformationMatrix() {
        return false;
    }

    @Override
    public boolean willChangeBounds() {
        return false;
    }

    /**
     * @hide
     */
    @Override
    public boolean hasAlpha() {
        return true;
    }
}
