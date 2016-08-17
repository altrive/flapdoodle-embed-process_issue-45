package flapdoodle.embed.process.issue45;

import de.flapdoodle.embed.process.config.IExecutableProcessConfig;
import de.flapdoodle.embed.process.config.IRuntimeConfig;
import de.flapdoodle.embed.process.distribution.Distribution;
import de.flapdoodle.embed.process.extract.IExtractedFileSet;
import de.flapdoodle.embed.process.runtime.Executable;

import java.io.IOException;

/**
 * @author [[mailto:michael@ahlers.co Michael Ahlers]]
 */
public class MockExecutable extends Executable<IExecutableProcessConfig, MockProcess> {
    public MockExecutable(Distribution distribution, IExecutableProcessConfig config, IRuntimeConfig runtimeConfig, IExtractedFileSet executable) {
        super(distribution, config, runtimeConfig, executable);
    }

    protected MockProcess start(Distribution distribution, IExecutableProcessConfig config, IRuntimeConfig runtimeConfig) throws IOException {
        return new MockProcess(distribution, config, runtimeConfig, this);
    }
}
