package com.xtremelabs.robolectric.shadows;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;


import com.xtremelabs.robolectric.internal.Implementation;
import com.xtremelabs.robolectric.internal.Implements;

@SuppressWarnings( { "UnusedDeclaration" })
@Implements(AnimationUtils.class)
public class ShadowAnimationUtils {
	
	@Implementation
	public static Animation loadAnimation(Context context, int id) {
		return new TranslateAnimation(0, 0, 30, 0);
	}
	

}
