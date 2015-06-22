/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.android.launcher3;

/*import com.android.launcher3.backup.BackupProtos.CheckedMessage;
import com.android.launcher3.backup.BackupProtos.Favorite;
import com.android.launcher3.backup.BackupProtos.Key;
import com.android.launcher3.backup.BackupProtos.Journal;
import com.android.launcher3.backup.BackupProtos.Resource;
import com.android.launcher3.backup.BackupProtos.Screen;
import com.android.launcher3.backup.BackupProtos.Widget;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;*/

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.System;
import java.util.LinkedList;
import java.util.List;
import java.util.zip.CRC32;

//import javax.xml.bind.DatatypeConverter;


/**
 * Commandline utility for decoding Launcher3 backup protocol buffers.
 *
 * <P>When using com.android.internal.backup.LocalTransport, the file names are base64-encoded Key
 * protocol buffers with a prefix, that have been base64-encoded again by the transport:
 * <pre>
 *     echo "TDpDQUlnL0pxVTVnOD0=" | launcher_protoutil -k
 * </pre>
 *
 * <P>This tool understands these file names and will use the embedded Key to detect the type and
 * extract the payload automatically:
 * <pre>
 *     launcher_protoutil /tmp/TDpDQUlnL0pxVTVnOD0=
 * </pre>
 *
 * <P>With payload debugging enabled, base64-encoded protocol buffers will be written to the logs.
 * Copy the encoded snippet from the log, and specify the type explicitly, with the Logs flags:
 * <pre>
 *    echo "CAEYLiCJ9JKsDw==" | launcher_protoutil -L -k
 * </pre>
 * For backup payloads it is more convenient to copy the log snippet to a file:
 * <pre>
 *    launcher_protoutil -L -f favorite.log
 * </pre>
 */
class DecoderRing {


}