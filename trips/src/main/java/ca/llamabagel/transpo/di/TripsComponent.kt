/*
 * Copyright (c) 2019 Derek Ellis. Subject to the MIT license.
 */

package ca.llamabagel.transpo.di

import ca.llamabagel.transpo.di.scope.FeatureScope
import ca.llamabagel.transpo.ui.TripsActivity
import dagger.Component

@FeatureScope
@Component(modules = [TripsModule::class, TransitDatabaseModule::class], dependencies = [CoreComponent::class])
abstract class TripsComponent : BaseActivityComponent<TripsActivity> {

    @Component.Builder
    interface Builder {
        fun build(): TripsComponent

        fun coreComponent(component: CoreComponent): Builder
        fun transitDatabaseModule(module: TransitDatabaseModule): Builder
    }

}