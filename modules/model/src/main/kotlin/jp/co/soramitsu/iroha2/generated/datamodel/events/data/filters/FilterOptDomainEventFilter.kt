//
// Auto-generated file. DO NOT EDIT!
//
package jp.co.soramitsu.iroha2.generated.datamodel.events.`data`.filters

import jp.co.soramitsu.iroha2.ModelEnum
import jp.co.soramitsu.iroha2.codec.ScaleCodecReader
import jp.co.soramitsu.iroha2.codec.ScaleCodecWriter
import jp.co.soramitsu.iroha2.codec.ScaleReader
import jp.co.soramitsu.iroha2.codec.ScaleWriter
import jp.co.soramitsu.iroha2.generated.datamodel.events.`data`.filters.domain.DomainEventFilter
import jp.co.soramitsu.iroha2.wrapException
import kotlin.Int

/**
 * FilterOptDomainEventFilter
 *
 * Generated from 'iroha_data_model::events::data::filters::FilterOptDomainEventFilter' enum
 */
public sealed class FilterOptDomainEventFilter : ModelEnum {
    /**
     * @return Discriminator of variant in enum
     */
    public abstract fun discriminant(): Int

    /**
     * 'AcceptAll' variant
     */
    public class AcceptAll : FilterOptDomainEventFilter() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object : ScaleReader<AcceptAll>, ScaleWriter<AcceptAll> {
            public const val DISCRIMINANT: Int = 0

            public override fun read(reader: ScaleCodecReader): AcceptAll = try {
                AcceptAll()
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public override fun write(writer: ScaleCodecWriter, instance: AcceptAll) = try {
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    /**
     * 'BySome' variant
     */
    public data class BySome(
        public val domainEventFilter: DomainEventFilter
    ) : FilterOptDomainEventFilter() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object : ScaleReader<BySome>, ScaleWriter<BySome> {
            public const val DISCRIMINANT: Int = 1

            public override fun read(reader: ScaleCodecReader): BySome = try {
                BySome(
                    DomainEventFilter.read(reader),
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public override fun write(writer: ScaleCodecWriter, instance: BySome) = try {
                DomainEventFilter.write(writer, instance.domainEventFilter)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    public companion object :
        ScaleReader<FilterOptDomainEventFilter>,
        ScaleWriter<FilterOptDomainEventFilter> {
        public override fun read(reader: ScaleCodecReader): FilterOptDomainEventFilter = when (
            val
            discriminant = reader.readUByte().toInt()
        ) {
            0 -> AcceptAll.read(reader)
            1 -> BySome.read(reader)
            else -> throw RuntimeException("Unresolved discriminant of the enum variant: $discriminant")
        }

        public override fun write(writer: ScaleCodecWriter, instance: FilterOptDomainEventFilter) {
            writer.directWrite(instance.discriminant())
            when (val discriminant = instance.discriminant()) {
                0 -> AcceptAll.write(writer, instance as AcceptAll)
                1 -> BySome.write(writer, instance as BySome)
                else -> throw RuntimeException("Unresolved discriminant of the enum variant: $discriminant")
            }
        }
    }
}
