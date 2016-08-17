package flapdoodle.embed.process.issue45;

import de.flapdoodle.embed.process.config.IExecutableProcessConfig;
import de.flapdoodle.embed.process.config.IRuntimeConfig;
import de.flapdoodle.embed.process.distribution.Distribution;
import de.flapdoodle.embed.process.extract.IExtractedFileSet;
import de.flapdoodle.embed.process.runtime.AbstractProcess;

import java.io.IOException;
import java.util.*;

/**
 * @author [[mailto:michael@ahlers.co Michael Ahlers]]
 */
public class MockProcess extends AbstractProcess<IExecutableProcessConfig, MockExecutable, MockProcess> {

    public MockProcess(Distribution distribution, IExecutableProcessConfig config, IRuntimeConfig runtimeConfig, MockExecutable executable) throws IOException {
        super(distribution, config, runtimeConfig, executable);
    }

    protected List<String> getCommandLine(Distribution distribution, IExecutableProcessConfig iExecutableProcessConfig, IExtractedFileSet iExtractedFileSet) throws IOException {
        return Arrays.asList("cmd", "/c", "more");
    }

    protected void stopInternal() {
    }

    protected void cleanupInternal() {
    }
}
