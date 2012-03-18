#@PydevCodeAnalysisIgnore
import rapid61850
from rapid61850 import *

rapid61850.start()

for i in range(2):
    print rapid61850.gse_send_D1Q1SB4_C1_MMXUResult_buf(1, 512);    # send GOOSE packet

rapid61850.cvar.E1Q1SB1.S1.C1.LPHDa_1.Mod.stVal = MOD_ON            # interact with IED data model
print rapid61850.cvar.E1Q1SB1.S1.C1.LPHDa_1.Mod.stVal