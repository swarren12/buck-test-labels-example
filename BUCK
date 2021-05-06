remote_file(
	name = 'junit.jar',
	url = 'https://repo1.maven.org/maven2/junit/junit/4.12/junit-4.12.jar',
	sha1 = '2973d150c0dc1fefe998f834810d68f278ea58ec',
)

remote_file(
	name = 'hamcrest-core.jar',
	url = 'https://repo1.maven.org/maven2/org/hamcrest/hamcrest-core/2.2/hamcrest-core-2.2.jar',
	sha1 = '3f2bd07716a31c395e2837254f37f21f0f0ab24b',
)

remote_file(
	name = 'hamcrest.jar',
	url = 'https://repo1.maven.org/maven2/org/hamcrest/hamcrest/2.2/hamcrest-2.2.jar',
	sha1 = '1820c0968dba3a11a1b30669bb1f01978a91dedc',
)

prebuilt_jar(
	name = 'hamcrest',
	binary_jar = ':hamcrest.jar',
)

prebuilt_jar(
	name = 'hamcrest-core',
	binary_jar = ':hamcrest-core.jar',
	deps = [ ':hamcrest' ],
)

prebuilt_jar(
	name = 'junit',
	binary_jar = ':junit.jar',
	deps = [ ':hamcrest-core' ],
)

java_test(
	name = 'test1',
	srcs = [ 'javatest/tests/FastStableTest.java' ],
	deps = [ ':junit' ],
	labels = [ 'fast', 'stable' ],
	visibility = [ 'PUBLIC' ],
)

java_test(
	name = 'test2',
	srcs = [ 'javatest/tests/FastTrustworthyTest.java' ],
	deps = [ ':junit' ],
	labels = [ 'fast', 'trustworthy' ],
	visibility = [ 'PUBLIC' ],
)

java_test(
	name = 'test3',
	srcs = [ 'javatest/tests/FastUnstableTest.java' ],
	deps = [ ':junit' ],
	labels = [ 'fast', 'unstable' ],
	visibility = [ 'PUBLIC' ],
)

java_test(
	name = 'test4',
	srcs = [ 'javatest/tests/SlowTest.java' ],
	deps = [ ':junit' ],
	labels = [ 'slow' ],
	visibility = [ 'PUBLIC' ],
)
