# set tutorial to the name of the main file without the .tex
tutorial    = expressions
q_srcs      = $(tutorial).tex
answer      = exp_answer
src         = Expression.java NumberExpression.java LBinaryExpression.java \
              Addition.java Multiplication.java
sol_dir     = ../solution/src

# put the names of figure files here.  include the .eps
# figures = tree.eps

TEX = pdflatex

styledir = ../..
style    = java-specs.sty problem.sty
imgdir   = images
# figures  = $(wildcard $(imgdir)/*.jpg)

.PHONY: clean reallyclean $(solution).ps

default: questions 

questions: $(tutorial).pdf

answers: $(answer).pdf

# reruns latex if needed.  to get rid of this capability, delete the
# three lines after the rule. 
# idea from http://ctan.unsw.edu.au/help/uk-tex-faq/Makefile
$(tutorial).pdf : $(style) $(q_srcs) $(figures)
	while ($(TEX) $(tutorial) ; \
	grep -q -e "Rerun to get outlines" -e "Rerun to get cross" \
	  $(tutorial).log ) do true ; \
	done

$(answer).pdf: $(src)
	cat $(src) | enscript -2Gr -C -Ejava -o - | ps2pdf - $@ 

$(src): % : $(sol_dir)/%
	cp $< .

$(style): % : $(styledir)/%
	cp $< .

clean: 
	rm -f $(tutorial).aux $(tutorial).log \
	      $(tutorial).pdf $(answer).pdf

reallyclean: clean
	rm -f  $(src) $(style)

