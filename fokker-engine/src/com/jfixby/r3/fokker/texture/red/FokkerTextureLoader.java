
package com.jfixby.r3.fokker.texture.red;

import java.io.IOException;

import com.jfixby.r3.fokker.texture.api.FokkerTexturePackageReader;
import com.jfixby.r3.rana.api.format.PackageFormat;
import com.jfixby.r3.rana.api.loader.PackageLoader;
import com.jfixby.r3.rana.api.loader.PackageReaderInput;
import com.jfixby.scarabei.api.collections.Collection;
import com.jfixby.scarabei.api.collections.Collections;
import com.jfixby.scarabei.api.collections.List;

public final class FokkerTextureLoader implements FokkerTexturePackageReader, PackageLoader {
	public static final PackageFormat TEXTURE = new PackageFormat(FokkerTexturePackageReader.PACKAGE_FORMAT_TEXTURE);
	public static final PackageFormat ATLAS = new PackageFormat(FokkerTexturePackageReader.PACKAGE_FORMAT_ATLAS);

	final List<PackageFormat> acceptablePackageFormats = Collections.newList();
	private final RedFokkerRaster registry;

	public FokkerTextureLoader (final RedFokkerRaster registry) {
		this.acceptablePackageFormats.add(TEXTURE);
		this.acceptablePackageFormats.add(ATLAS);
		this.registry = registry;
	}

	@Override
	public Collection<PackageFormat> listAcceptablePackageFormats () {
		return this.acceptablePackageFormats;
	}

	@Override
	public void doReadPackage (final PackageReaderInput input) throws IOException {
		final RedFokkerRasterDataGroup group = new RedFokkerRasterDataGroup(input, this, this.registry);

	}

	@Override
	public PackageLoader reader () {
		return this;
	}

}
