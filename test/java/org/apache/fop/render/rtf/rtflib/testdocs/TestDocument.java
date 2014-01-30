/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/* $Id$ */


/*
 * This file is part of the RTF library of the FOP project, which was originally
 * created by Bertrand Delacretaz <bdelacretaz@codeconsult.ch> and by other
 * contributors to the jfor project (www.jfor.org), who agreed to donate jfor to
 * the FOP project.
 */

package org.apache.fop.render.rtf.rtflib.testdocs;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

import org.apache.fop.render.rtf.rtflib.rtfdoc.RtfDocumentArea;
import org.apache.fop.render.rtf.rtflib.rtfdoc.RtfFile;
import org.apache.fop.render.rtf.rtflib.rtfdoc.RtfParagraph;
import org.apache.fop.render.rtf.rtflib.rtfdoc.RtfSection;

/**  Base class for generating RTF documents used to test the jfor rtflib package.
 */

abstract class TestDocument {
    private File output;

    final void setOutputDir(File outDir)
    throws IOException {
        output = new File(outDir, getRtfFilename());
    }

    final String getRtfFilename() {
        // use class name for output filename
        final String name = getClass().getName();
        final int pos = name.lastIndexOf('.');
        return name.substring(pos + 1) + ".rtf";
    }

    final void generateOutput()
    throws IOException {
        debugMsg("Generating document " + output + "...");
        final RtfFile f = new RtfFile(new FileWriter(output));
        final RtfDocumentArea rda = f.startDocumentArea();
        final RtfSection sect = rda.newSection();
        addIntroComments(sect);
        generateDocument(rda, sect);
        f.flush();
    }

    protected abstract void generateDocument(RtfDocumentArea rda, RtfSection sect)
            throws IOException;

    void debugMsg(String msg) {
        System.err.println(msg);
    }

    protected void addIntroComments(RtfSection sect) throws IOException {
        final RtfParagraph para = sect.newParagraph();

        para.newText("jfor RTF library test document.");
        para.newLineBreak();
//        para.newText(JForVersionInfo.getLongVersionInfo());
        para.newLineBreak();
        para.newText("generated by class " + getClass().getName());
        para.newLineBreak();
        para.newText("generated on " + new Date());
        para.close();
   }
}
