package flapdoodle.embed.process.issue45;

import de.flapdoodle.embed.process.config.store.FileSet;
import de.flapdoodle.embed.process.config.store.IPackageResolver;
import de.flapdoodle.embed.process.distribution.ArchiveType;
import de.flapdoodle.embed.process.distribution.Distribution;

/**
 * @author [[mailto:michael@ahlers.co Michael Ahlers]]
 */
public class MockPackageResolver
        implements IPackageResolver {

    public FileSet getFileSet(Distribution distribution) {
        return null;
    }

    public ArchiveType getArchiveType(Distribution distribution) {
        return null;
    }

    public String getPath(Distribution distribution) {
        return null;
    }

}
