srcdir  = src
bindir  = bin
testdir = test
libdir  = lib
package = intro
runner  = $(package)/ExpsTestRunner
main    = $(bindir)/$(runner).class
mainsrc = $(testdir)/$(runner).java

.PHONY: test clean


$(main): $(testdir)/*/*.java $(srcdir)/*/*.java
	javac -d $(bindir) -sourcepath "$(srcdir):$(testdir)" \
	  -cp "$(libdir)/*:$(bindir)" $(mainsrc)

test:  $(main)
	cd $(bindir) && java -cp "../$(libdir)/*:." $(runner)

clean: 
	rm -f **/*.class
