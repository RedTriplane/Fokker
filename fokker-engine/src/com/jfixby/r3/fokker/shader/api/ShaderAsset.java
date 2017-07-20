
package com.jfixby.r3.fokker.shader.api;

import com.jfixby.r3.render.api.ShaderParameter;
import com.jfixby.rana.api.Asset;
import com.jfixby.scarabei.api.collections.Mapping;

public interface ShaderAsset extends Asset {

	public Mapping<String, ShaderParameter> listParameters ();

}
