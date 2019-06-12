/*
 * Copyright (c) 2019 Derek Ellis. Subject to the MIT license.
 */

package ca.llamabagel.transpo.ui.trips

import ca.llamabagel.transpo.data.Result
import ca.llamabagel.transpo.data.TestStops
import ca.llamabagel.transpo.data.provideFakeTripsRepository
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.Test

class GetStopUseCaseTest {

    private val getStop = GetStopUseCase(provideFakeTripsRepository())

    @Test
    fun `get stop`() = runBlocking {
        val stop = getStop(TestStops.mackenzieKing1A.id)

        assertTrue(stop is Result.Success)
        assertEquals(TestStops.mackenzieKing1A, (stop as Result.Success).data)
    }
}