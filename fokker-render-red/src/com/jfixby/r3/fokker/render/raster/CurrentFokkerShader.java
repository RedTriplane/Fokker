
package com.jfixby.r3.fokker.render.raster;

import com.jfixby.r3.fokker.assets.api.shader.FokkerShader;
import com.jfixby.scarabei.api.util.JUtils;

public class CurrentFokkerShader {

	private com.badlogic.gdx.graphics.glutils.ShaderProgram gdx_shader_program;
	private FokkerShader current_shader;
	private boolean the_same;

	public final boolean setShader (final FokkerShader shader_handler) {
		this.the_same = equals(this.current_shader, shader_handler);
		if (this.the_same) {
			return false;
		}
		this.current_shader = shader_handler;
		this.gdx_shader_program = this.current_shader.getGdxShaderProgram();
		return true;
	}

	static final private boolean equals (final FokkerShader a, final FokkerShader b) {
		return JUtils.equalObjects(a, b);
	}

	public final com.badlogic.gdx.graphics.glutils.ShaderProgram getGdxShaderProgram () {
		return this.gdx_shader_program;
	}

}
